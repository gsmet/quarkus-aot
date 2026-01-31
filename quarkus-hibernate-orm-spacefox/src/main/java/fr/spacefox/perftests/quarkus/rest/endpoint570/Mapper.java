package fr.spacefox.perftests.quarkus.rest.endpoint570;

import fr.spacefox.perftests.quarkus.core.service570.model.Model570;
import fr.spacefox.perftests.quarkus.rest.endpoint570.schema.Schema570;

final class Mapper {
    private Mapper() {}

    public static Schema570 of(Model570 model) {
        return new Schema570(model.id(), model.value());
    }
}
