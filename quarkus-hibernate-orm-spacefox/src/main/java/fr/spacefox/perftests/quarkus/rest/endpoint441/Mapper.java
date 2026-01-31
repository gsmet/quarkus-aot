package fr.spacefox.perftests.quarkus.rest.endpoint441;

import fr.spacefox.perftests.quarkus.core.service441.model.Model441;
import fr.spacefox.perftests.quarkus.rest.endpoint441.schema.Schema441;

final class Mapper {
    private Mapper() {}

    public static Schema441 of(Model441 model) {
        return new Schema441(model.id(), model.value());
    }
}
