package fr.spacefox.perftests.quarkus.data.entity404;

import fr.spacefox.perftests.quarkus.core.service404.model.Model404;

final class Mapper {
    private Mapper() {}

    public static Model404 of(Entity404 entity) {
        return new Model404(entity.getId(), entity.getField());
    }
}
