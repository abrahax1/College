# Using decision trees
import random
import pandas as pd 
from sklearn.tree import DecisionTreeClassifier

features = ['id','age','job','marital','education','default','balance','housing','loan','contact','day','month','duration','campaign','pdays','previous','poutcome','output']
df = pd.read_csv('trainingset.txt', na_values='unknown', names=features)
df2 = pd.read_csv('queries.txt', na_values='unknown', names=features)

# Replacing unknown values from categorical to continuous
df = df.fillna(0)
df2 = df2.fillna(0)

# Replaces the values from categorical to continuous 
def replace_vals(df):
    df.loc[df['age'] <= 25, 'age'] = 1
    df.loc[df['age'] <= 45, 'age'] = 2
    df.loc[df['age'] <= 65, 'age'] = 3
    df.loc[df['age'] > 65, 'age'] = 4

    job = ['JobCat1','JobCat2','JobCat3','JobCat4','JobCat5','JobCat6','JobCat7','JobCat8','JobCat9','JobCat10','JobCat11']
    df['job'].replace(job, [1,2,3,4,5,6,7,8,9,10,11], inplace=True)

    marital = ["married","divorced","single"]
    df['marital'].replace(marital, [1,2,3], inplace=True)

    education = ["secondary","primary","tertiary"]
    df['education'].replace(education, [1,2,3], inplace=True)

    housing = ["yes","no"]
    df['housing'].replace(housing, [1,2], inplace=True)

    loan = ["yes","no"]
    df['loan'].replace(loan, [1,2], inplace=True)

    month = ["jan","feb","mar","apr","may","jun","jul","aug","sep","oct","nov", "dec"]
    df['month'].replace(month, [1,2,3,4,5,6,7,8,9,10,11,12], inplace=True)

    return df

df = replace_vals(df) 

Newfeatures = ['age','job','marital','education','balance','housing','loan','month']
output = df.output
training = df[Newfeatures]

# Using entropy as the criteria for the tree to decide on the nodes
dtree = DecisionTreeClassifier(criterion="entropy")
dtree = dtree.fit(training, output)

df2 = replace_vals(df2)
queries = df2[Newfeatures]

# Predict queries
prediction = dtree.predict(queries)

accuracy_list = []

# Use randon sample of training data 
print('Please wait to check for accuracy')
for j in range(1, 11):
    training_data = []

    ran_num = random.sample(range(len(training)), len(prediction))

    # creating df containing the random training data
    for i in ran_num:
        if i == 0: training_data.append(list(df.loc[i]))
        else: training_data.append(list(df.loc[i-1]))

    df3 = pd.DataFrame(training_data, columns = features)
    training_data = df3[Newfeatures]

    accuracy_list.append(dtree.score(training_data,prediction)*100)

length = len(accuracy_list)
harmonic_accuracy = 0

# calculating harmonic average
for i in range(0, length):
    harmonic_accuracy = harmonic_accuracy + (1) / accuracy_list[i]
    
print('accuracy:', length / harmonic_accuracy)

# Create txt file + format it 
with open('solutions.txt', 'w') as convert_file:
    for key, value in zip(df2.id, prediction):
        convert_file.write("{},{}\n".format(key,value))

print('\nSolutions.txt file created')
    