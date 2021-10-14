//A fully working code for producer-consumer problem being taught in the course Operating Systems
#include<stdio.h>
#include<unistd.h>
#include<sys/types.h>
#include<semaphore.h>
#include<pthread.h>
#include<stdlib.h>
#define N 10
int in=0,buff[10],out=0;
sem_t mutex,full,empty;
void *producer(void * data);
void *consumer(void * data);

int main()
{
	sem_init(&mutex,0,1);
	sem_init(&full,0,0);
	sem_init(&empty,0,N);
	pthread_t ptid[5];
	pthread_t ctid[5];
	int i=0;
	char a;
	for(i=0;i<5;i++)
	{
		a=i+1;
		pthread_create(&ptid[i],NULL,producer,a);
	}
	for(i=0;i<5;i++)
	{
		a=i+1;
		pthread_create(&ctid[i],NULL,consumer,a);
	}
	for(i=0;i<5;i++)
	{
		pthread_join(ptid[i],NULL);
		pthread_join(ctid[i],NULL);
	}
	sem_destroy(&mutex);
	sem_destroy(&full);
	sem_destroy(&empty);
	pthread_exit(NULL);
}
    //Produces in the buffer
	void * producer(void * data)
	{
		int k=(int)data;
		sem_wait(&empty);
		sem_wait(&mutex);
		printf("Pro %d has inserted %d into buffer",k,k);
		buff[in]=k;
		in=(in+1)%N;
		sem_post(&mutex);
		sem_post(&full);
		pthread_exit(0);
	}

    //Consumes from the buffer
	void *consumer(void *data)
	{
		int k=(int)data;
		sem_wait(&full);
		sem_wait(&mutex);
		printf("con %d has consumed %d from buffer",k,buff[out]);
		out=(out+1)%N;
		sem_post(&mutex);
		sem_post(&full);
		pthread_exit(0);
	}