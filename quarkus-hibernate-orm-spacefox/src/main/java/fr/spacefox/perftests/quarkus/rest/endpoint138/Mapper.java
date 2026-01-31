package fr.spacefox.perftests.quarkus.rest.endpoint138;

import fr.spacefox.perftests.quarkus.core.service138.model.Model138;
import fr.spacefox.perftests.quarkus.rest.endpoint138.schema.Schema138;

final class Mapper {
    private Mapper() {}

    public static Schema138 of(Model138 model) {
        return new Schema138(model.id(), model.value());
    }
}
