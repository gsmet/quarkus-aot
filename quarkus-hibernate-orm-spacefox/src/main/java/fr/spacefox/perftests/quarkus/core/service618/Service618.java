package fr.spacefox.perftests.quarkus.core.service618;

import fr.spacefox.perftests.quarkus.core.port.data.Entity618DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service618.model.Model618;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service618 {

    private final Entity618DatasourcePort datasource;

    public Service618(Entity618DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model618 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
