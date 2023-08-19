# ask for weight and height in Kg and meters
Weight = float(input("Enter your Weight in Kg: "))
Height = float(input("Enter your Height in M: "))

# gets BMI by using formula
BMI = Weight / (Height ** 2)

print("Your BMI is:", BMI)

# ask for weight and height in pounds and inches
Weight_in_pounds = float(input("Enter your Weight in pounds: "))
Height_in_inches = float(input("Enter your Height in inches: "))

# converts weight and height by using formula
Weight_in_pounds = Weight_in_pounds / 2.205
Height_in_inches = Height_in_inches / 39.37

print("Weight converted to Kg: ", Weight_in_pounds)
print("Height converted to M: ", Height_in_inches)
