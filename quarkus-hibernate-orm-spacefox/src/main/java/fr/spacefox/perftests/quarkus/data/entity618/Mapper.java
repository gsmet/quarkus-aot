package fr.spacefox.perftests.quarkus.data.entity618;

import fr.spacefox.perftests.quarkus.core.service618.model.Model618;

final class Mapper {
    private Mapper() {}

    public static Model618 of(Entity618 entity) {
        return new Model618(entity.getId(), entity.getField());
    }
}
