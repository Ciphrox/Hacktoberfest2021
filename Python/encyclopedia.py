from PyDictionary import PyDictionary
dictionary=PyDictionary()

""" Program to print the encyclopedia of a given word """


word = str(input("Enter Word :"))
if word:
    try:
        mean_dict = dictionary.meaning(word)
    except exception as e:

        mean_dict = None
        print("Not Found")
    if mean_dict:

        w1 = word.capitalize()
        w2 = "/".join(list(mean_dict.keys()))

        meaning_str = ''
        line_counter = 0

        for meanings in list(mean_dict.values())[0]:
            if len(meaning_str)<200:
                line_counter += 1
                s = meaning_str
                meaning_str+= meanings.capitalize()+".\n"
            if line_counter == 3:
                break
        print(s)
    else:
        print(word.capitalize())
        print(w2)