package fr.spacefox.perftests.quarkus.core.service435;

import fr.spacefox.perftests.quarkus.core.port.data.Entity435DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service435.model.Model435;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service435 {

    private final Entity435DatasourcePort datasource;

    public Service435(Entity435DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model435 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
