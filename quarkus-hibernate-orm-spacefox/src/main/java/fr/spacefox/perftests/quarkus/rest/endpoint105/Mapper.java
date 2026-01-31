package fr.spacefox.perftests.quarkus.rest.endpoint105;

import fr.spacefox.perftests.quarkus.core.service105.model.Model105;
import fr.spacefox.perftests.quarkus.rest.endpoint105.schema.Schema105;

final class Mapper {
    private Mapper() {}

    public static Schema105 of(Model105 model) {
        return new Schema105(model.id(), model.value());
    }
}
