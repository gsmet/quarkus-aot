package fr.spacefox.perftests.quarkus.rest.endpoint156;

import fr.spacefox.perftests.quarkus.core.service156.model.Model156;
import fr.spacefox.perftests.quarkus.rest.endpoint156.schema.Schema156;

final class Mapper {
    private Mapper() {}

    public static Schema156 of(Model156 model) {
        return new Schema156(model.id(), model.value());
    }
}
