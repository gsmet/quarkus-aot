package fr.spacefox.perftests.quarkus.rest.endpoint949;

import fr.spacefox.perftests.quarkus.core.service949.model.Model949;
import fr.spacefox.perftests.quarkus.rest.endpoint949.schema.Schema949;

final class Mapper {
    private Mapper() {}

    public static Schema949 of(Model949 model) {
        return new Schema949(model.id(), model.value());
    }
}
