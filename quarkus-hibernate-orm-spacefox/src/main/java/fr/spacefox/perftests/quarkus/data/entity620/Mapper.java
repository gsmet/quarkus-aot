package fr.spacefox.perftests.quarkus.data.entity620;

import fr.spacefox.perftests.quarkus.core.service620.model.Model620;

final class Mapper {
    private Mapper() {}

    public static Model620 of(Entity620 entity) {
        return new Model620(entity.getId(), entity.getField());
    }
}
