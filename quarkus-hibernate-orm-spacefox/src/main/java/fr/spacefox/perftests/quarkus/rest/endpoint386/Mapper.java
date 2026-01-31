package fr.spacefox.perftests.quarkus.rest.endpoint386;

import fr.spacefox.perftests.quarkus.core.service386.model.Model386;
import fr.spacefox.perftests.quarkus.rest.endpoint386.schema.Schema386;

final class Mapper {
    private Mapper() {}

    public static Schema386 of(Model386 model) {
        return new Schema386(model.id(), model.value());
    }
}
