package fr.spacefox.perftests.quarkus.rest.endpoint618;

import fr.spacefox.perftests.quarkus.core.service618.model.Model618;
import fr.spacefox.perftests.quarkus.rest.endpoint618.schema.Schema618;

final class Mapper {
    private Mapper() {}

    public static Schema618 of(Model618 model) {
        return new Schema618(model.id(), model.value());
    }
}
