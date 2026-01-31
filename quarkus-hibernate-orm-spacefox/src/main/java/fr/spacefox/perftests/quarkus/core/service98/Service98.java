package fr.spacefox.perftests.quarkus.core.service98;

import fr.spacefox.perftests.quarkus.core.port.data.Entity98DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service98.model.Model98;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service98 {

    private final Entity98DatasourcePort datasource;

    public Service98(Entity98DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model98 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
