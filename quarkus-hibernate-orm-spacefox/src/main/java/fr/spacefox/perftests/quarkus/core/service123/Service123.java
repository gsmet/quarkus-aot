package fr.spacefox.perftests.quarkus.core.service123;

import fr.spacefox.perftests.quarkus.core.port.data.Entity123DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service123.model.Model123;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service123 {

    private final Entity123DatasourcePort datasource;

    public Service123(Entity123DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model123 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
