d = {
    'Spock' : ['tesoura', 'pedra'],
    'tesoura' : ['lagarto', 'papel'],
    'lagarto' : ['Spock', 'papel'],
    'pedra': ['lagarto', 'tesoura'],
    'papel': ['pedra', 'Spock']
}

n = int(input())

for i in range(n):
    player1, player2 = [x for x in input().split()]
    if player1 == player2:
        print('Caso #%d: De novo!' % (i+1))
    elif player2 in d[player1]:
        print('Caso #%d: Bazinga!' % (i+1))
    else:
        print('Caso #%d: Raj trapaceou!' % (i+1))