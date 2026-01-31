package fr.spacefox.perftests.quarkus.core.service537;

import fr.spacefox.perftests.quarkus.core.port.data.Entity537DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service537.model.Model537;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service537 {

    private final Entity537DatasourcePort datasource;

    public Service537(Entity537DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model537 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
