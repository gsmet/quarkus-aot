package fr.spacefox.perftests.quarkus.rest.endpoint767;

import fr.spacefox.perftests.quarkus.core.service767.model.Model767;
import fr.spacefox.perftests.quarkus.rest.endpoint767.schema.Schema767;

final class Mapper {
    private Mapper() {}

    public static Schema767 of(Model767 model) {
        return new Schema767(model.id(), model.value());
    }
}
