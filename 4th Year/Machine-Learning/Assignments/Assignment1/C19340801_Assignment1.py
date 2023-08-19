# Programmed by Abraham Izarra / C19340801 #

from random import randint
import pandas as pd

# Reading features for data
features = open('./data/feature_names.txt')
features = features.read().splitlines()

# creating division between continuous and categorical data
continuous_feat = ['age', 'fnlwgt', 'education-num', 'capital-gain', 'capital-loss', 'hours-per-week']
categorical_feat = ['workclass', 'education', 'marital-status', 'occupation', 'relationship', 'race', 'sex', 'native-country']

# Reading data, replaces values with '?' to NaN and adds column names as features above
data = pd.read_csv('.\data\dataset.csv', na_values=' ?', names=features)

# Creating table columns
continuous_table = {'Feature':[], 'Count':[], '% Miss':[], 'Card':[], 'Min':[], '1st Qrt':[], 'Mean':[], 'Median':[], '3rd Qrt':[], 'Max':[], 'Std Dev':[]}
categorical_table = {'Feature':[], 'Count':[], '% Miss':[], 'Card':[], 'Mode':[], 'Mode freq':[], 'Mode %':[], '2nd Mode':[], '2nd Mode freq':[], '2nd Mode %':[]}

# Adding extra missing % (age) as I did not want to clamp this column
continuous_table['% Miss'].append("{}%".format(0.0))

# Using mean and std to do clamp transformation
for i in range(1, len(continuous_feat)):
    mean = data[continuous_feat[i]].mean()
    std = data[continuous_feat[i]].std()

    lower = int(mean - (2 * std))
    if lower < 0:
        lower = data[continuous_feat[i]].min()
    higher = int(mean + (2 * std))

    # Using randon number between lower and higher to keep data nearly unchanged
    rand_num = randint(lower, higher)

    # Finding count of values in columns
    Count = data[continuous_feat[i]].count()

    # Finding missing percentage rounded to 2 decimal place
    missing = (data[continuous_feat[i]] < lower).sum() + ((data[continuous_feat[i]] > higher).sum())
    missing_perc = (missing / Count * 100)
    missing_perc = "{:.2f}".format(round(missing_perc, 2))
    
    continuous_table['% Miss'].append("{}%".format(missing_perc))

    # Masking (not replacing to not damage original data) the values in the columns higher than the threshold 
    data[continuous_feat[i]] = data[continuous_feat[i]].mask(data[continuous_feat[i]] > higher , rand_num)

for i in data:
    if i in continuous_feat:
        # Finding cardinality 
        card = data[i].nunique()

        # Finding necessary values and adding them into the table 
        to_table = data[i].describe().loc[['min', '25%' ,'mean', '50%', '75%', 'max', 'std']]
        
        count = 0
        for j in continuous_table:
            if j == 'Feature':
                continuous_table[j].append(i)
            elif j == 'Count':
                continuous_table[j].append(Count)
            elif j == 'Card':
                continuous_table[j].append(card)
            elif j == '% Miss':
                continue
            else:
                continuous_table[j].append(to_table[count])
                count += 1

    if i in categorical_feat:
        # Finding necessary values 
        to_table = data[i].describe().loc[['unique', 'top', 'freq']]

        # finding missing percentage rounded to 2 decimal place
        missing = data[i].isnull().sum()
        missing_perc = (missing / Count * 100)
        missing_perc = "{:.2f}".format(round(missing_perc, 2))

        # finding 1st mode % rounded to 2 decimal place
        mode_perc = (to_table[2] / Count * 100)
        mode_perc = "{:.2f}".format(round(mode_perc, 2))

        # finding 2nd mode and its frequency
        sec_mode = data[i].value_counts().index.tolist()[1]
        sec_mode_freq = data[i].value_counts()[1]

        # finding 2nd mode % rounded to 2 decimal place
        sec_mode_perc = (sec_mode_freq / Count * 100)
        sec_mode_perc = "{:.2f}".format(round(sec_mode_perc, 2))

        # Adding values into table 
        count = 0
        for j in categorical_table:
            if j == 'Feature':
                categorical_table[j].append(i)
            elif j == 'Count':
                categorical_table[j].append(Count)
            elif j == '% Miss':
                categorical_table[j].append("{}%".format(missing_perc))
            elif j == 'Card':
                categorical_table[j].append(to_table[count])
                count += 1
            elif j == 'Mode %':
                categorical_table[j].append("{}%".format(mode_perc))
            elif j == '2nd Mode':
                categorical_table[j].append(sec_mode)
            elif j == '2nd Mode freq':
                categorical_table[j].append(sec_mode_freq)
            elif j == '2nd Mode %':
                categorical_table[j].append("{}%".format(sec_mode_perc))
            else:
                categorical_table[j].append(to_table[count])
                count += 1

# Converting tables into a datafram and converting to csv
continuous_table = pd.DataFrame(continuous_table)
continuous_table.to_csv('C19340801CONT.csv', index=False)

categorical_table = pd.DataFrame(categorical_table)
categorical_table.to_csv('C19340801CAT.csv', index=False)
