import random

def get_random(floor, ceiling):
    return random.randrange(floor, ceiling + 1)
    
def shuffle(the_list):
    for fst_index in xrange(0, len(the_list) - 1):
        snd_index = get_random(0, len(the_list) - 1)
        if snd_index != fst_index:
            the_list[fst_index], the_list[snd_index] = \
                the_list[snd_index], the_list[fst_index]
    pass


sample_list = [1, 2, 3, 4, 5]
print 'Sample list:', sample_list

print 'Shuffling sample list...'
shuffle(sample_list)
print sample_list
