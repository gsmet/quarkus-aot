package fr.spacefox.perftests.quarkus.data.entity545;

import fr.spacefox.perftests.quarkus.core.service545.model.Model545;

final class Mapper {
    private Mapper() {}

    public static Model545 of(Entity545 entity) {
        return new Model545(entity.getId(), entity.getField());
    }
}
