package fr.spacefox.perftests.quarkus.rest.endpoint995;

import fr.spacefox.perftests.quarkus.core.service995.model.Model995;
import fr.spacefox.perftests.quarkus.rest.endpoint995.schema.Schema995;

final class Mapper {
    private Mapper() {}

    public static Schema995 of(Model995 model) {
        return new Schema995(model.id(), model.value());
    }
}
