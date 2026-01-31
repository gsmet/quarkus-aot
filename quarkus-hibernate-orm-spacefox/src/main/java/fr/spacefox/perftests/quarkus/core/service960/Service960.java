package fr.spacefox.perftests.quarkus.core.service960;

import fr.spacefox.perftests.quarkus.core.port.data.Entity960DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service960.model.Model960;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service960 {

    private final Entity960DatasourcePort datasource;

    public Service960(Entity960DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model960 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
