package com.movierecommender.main.di;

import com.google.inject.AbstractModule;
import com.google.inject.multibindings.Multibinder;
import com.movierecommender.main.commands.Command;
import com.movierecommender.main.commands.StreamingCommand;
import com.movierecommender.main.commands.TestCassandraCommand;
import com.movierecommender.main.commands.TestStreamingCommand;

public class MainModule extends AbstractModule {
    @Override
    protected void configure() {
        Multibinder<Command> uriBinder = Multibinder.newSetBinder(binder(),  Command.class);
        uriBinder.addBinding().to(StreamingCommand.class);
        uriBinder.addBinding().to(TestStreamingCommand.class);
        uriBinder.addBinding().to(TestCassandraCommand.class);
    }
}
