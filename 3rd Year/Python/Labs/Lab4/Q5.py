# creating a table using format method and an array/list
Names = ["Methane", "Ethane", "Propane", "Butane"]
Melting_p = ["-162", "-89", "-42", "-0.5"]
Boiling_p = ["-183", "-172", "-188", "-135"]
Titles = ["Name", "Melting_P", "Boiling_P"]

for t in Titles:
    print(f"{t:<15}", end="")
print()

for i in range(4):
    print(f"{Names[i]:<15} {Melting_p[i]:^5} {Boiling_p[i]:>12}")
