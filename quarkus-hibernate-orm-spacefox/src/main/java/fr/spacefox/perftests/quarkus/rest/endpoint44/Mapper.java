package fr.spacefox.perftests.quarkus.rest.endpoint44;

import fr.spacefox.perftests.quarkus.core.service44.model.Model44;
import fr.spacefox.perftests.quarkus.rest.endpoint44.schema.Schema44;

final class Mapper {
    private Mapper() {}

    public static Schema44 of(Model44 model) {
        return new Schema44(model.id(), model.value());
    }
}
