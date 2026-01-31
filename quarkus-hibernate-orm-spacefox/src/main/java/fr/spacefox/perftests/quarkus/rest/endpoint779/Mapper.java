package fr.spacefox.perftests.quarkus.rest.endpoint779;

import fr.spacefox.perftests.quarkus.core.service779.model.Model779;
import fr.spacefox.perftests.quarkus.rest.endpoint779.schema.Schema779;

final class Mapper {
    private Mapper() {}

    public static Schema779 of(Model779 model) {
        return new Schema779(model.id(), model.value());
    }
}
