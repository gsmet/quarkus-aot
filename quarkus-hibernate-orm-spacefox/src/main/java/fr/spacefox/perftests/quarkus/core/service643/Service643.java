package fr.spacefox.perftests.quarkus.core.service643;

import fr.spacefox.perftests.quarkus.core.port.data.Entity643DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service643.model.Model643;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service643 {

    private final Entity643DatasourcePort datasource;

    public Service643(Entity643DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model643 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
