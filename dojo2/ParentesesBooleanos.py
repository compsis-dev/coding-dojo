
print 'Hello'

#a = raw_input('Digite a expressao: ')
a = 'True and False xor True'
a=a.replace ("xor","^")


lista = a.split()
nParenteses = len(lista) - 3
template = []

for elemento in lista:
  template.append(' ')
  template.append(elemento)

template.append(' ')
res = eval(a)
print a, '=',res

if (res):
  conta = 1
else:
  conta = 0

templates = []

for index3 in range (1, nParenteses):
  print "colocando",index3,"parenteses"
  for index4 in range(0,index3):
    template2 = list(template)

    for index in range ( 0,len(template), 4):
      for index2 in range ( index + 2,len(template), 4):
        template2 [index] += '('
        template2 [index2] += ')'
        templates.append(template2)

  expressao = " " .join(template2)
  result = eval(expressao)
  if result:
    conta+=1
  print expressao, '=',result

print 'Total: ', conta


print template

#print eval(a)