package fr.spacefox.perftests.quarkus.core.service8;

import fr.spacefox.perftests.quarkus.core.port.data.Entity8DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service8.model.Model8;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service8 {

    private final Entity8DatasourcePort datasource;

    public Service8(Entity8DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model8 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
