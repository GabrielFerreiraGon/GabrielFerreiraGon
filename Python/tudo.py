# %%
import pandas as pd 
import numpy 
import openpyxl
import csv
tabela_de_vendas = pd.read_excel(r'C:\Users\gabri\Downloads\Vendas - Dez.xlsx')
tabela_de_vendas = tabela_de_vendas.drop('Data', axis= 1)
tabela_de_vendas = tabela_de_vendas.drop('Produto',axis=1)
tabela_de_vendas = tabela_de_vendas.drop('Valor Final', axis=1)
tabela_de_vendas = tabela_de_vendas.drop('Quantidade', axis=1)
W = tabela_de_vendas
print(W)
(W['ID Loja'].value_counts(normalize=True))


# %%
import pandas 
import numpy as np
import openpyxl
libe = pandas.read_csv('telecom_users.csv')
display(libe["Genero"].value_counts())


# %%
import pandas 
import numpy 
import openpyxl
libe = pandas.read_excel('entregas_relatorioww.xlsx')
libe.info()

# %%
import pandas as pd
import numpy as np
import openpyxl
libe = pandas.read_excel('entregas_relatorioww.xlsx')
libe = libe.drop('Nro. Entrega', axis=1)
(libe)



# %%
# SOMAS E MULTIPLICAÇÕES 
import pandas 
import numpy as np
a=1
b=3
c=4
g= (a),(c)
D= pandas.value_counts('b''bb') #soma objetos
u=b*1000
(u)
p= (u*c) #vezes 
(p)
j= (c+b) 
10**3 # ao quadrado 
(u)

# %%
a= 10 
#while a>8:
(a)
a=a-1
(a,12/2)# divisor


# %%
v=10 
x= v<8*a
(x)

# %%
print("ola mundo")

# %%
import csv 
import pandas as pd
lib = pd.read_csv('telecom_users.csv')
lib = lib.drop(['Unnamed: 0'], axis= 1)
print(lib['Casado'].value_counts(normalize=True).map("{:.1%}".format))


# %%
import plotly.express as px
coluna = 'Casado'
grafico = px.histogram(lib, x='Casado', color='Aposentado' )
(grafico)


# %%
import pandas
import plotly.express as plot 
import matplotlib as mat
gab = pandas.read_csv(r'C:\Users\gabri\Downloads\ggggg\entregas_relatorio12.csv', encoding='latin1', sep=';' ,error_bad_lines=False)
cidade = (gab[['Cidade Pessoa Visita','Dt. Recebimento','Nro. Entrega']])
#puxar a coluna 

#puxar a cidade agora 
#Ensure you have matplotlib installed.
#df is your dataframe
cidade = (cidade[['Cidade Pessoa Visita','Dt. Recebimento','Nro. Entrega']])
cidade = pandas.value_counts('Volta Redonda')


# %%
gab = gab.filter(items=['Nota Fiscal','Nro. Entrega','Cidade Pessoa Visita'])
gab.to_csv('liberados_para_entregas2.csv')


