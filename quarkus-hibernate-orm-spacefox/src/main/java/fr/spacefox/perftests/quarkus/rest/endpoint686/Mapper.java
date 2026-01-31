package fr.spacefox.perftests.quarkus.rest.endpoint686;

import fr.spacefox.perftests.quarkus.core.service686.model.Model686;
import fr.spacefox.perftests.quarkus.rest.endpoint686.schema.Schema686;

final class Mapper {
    private Mapper() {}

    public static Schema686 of(Model686 model) {
        return new Schema686(model.id(), model.value());
    }
}
