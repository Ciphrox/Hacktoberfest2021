from math import radians, cos, sin, asin, sqrt

def haversine(lon1, lat1, lon2, lat2):
    lon1, lat1, lon2, lat2 = map(radians, [lon1, lat1, lon2,lat2])
    dlon = lon2 - lon1
    dlat = lat2 - lat1
    a = sin(dlat / 2)**2 + cos(lat1) * cos(lat2) * sin(dlon /2)**2
    c = 2 * asin(sqrt(a))
    meters = 6371000 * c
    return meters

class Geopoint:
    def __init__(self,lat,lon):
        self.lat = lat
        self.lon = lon

    def __eq__(self, ob):
        return self.lat == ob.lat and self.lon == ob.lon
    
    def __str__(self):
        return "{ lat: " + str(self.lat) + " lon: " + str(self.lon) + " }."


def bubbleSort(arr):
    n = len(arr)
    for i in range(n-1):
        for j in range(0, n-i-1):

            if haversine(arr[j].lon,arr[j].lat,22.52222,51.21167) > haversine(arr[j+1].lon,arr[j+1].lat,22.52222,51.21167) :
                arr[j], arr[j+1] = arr[j+1], arr[j]


x = Geopoint(51.21782, 22.54583)
y = Geopoint(51.21353, 22.54142)
z = Geopoint(51.21483, 22.52527)
a = Geopoint(51.22352, 22.55640)
lista = [x,y,z,a]

print("Before sort: ")
for i in lista:
    print(i)

bubbleSort(lista)

print("After sort: ")
for i in lista:
    print(i)