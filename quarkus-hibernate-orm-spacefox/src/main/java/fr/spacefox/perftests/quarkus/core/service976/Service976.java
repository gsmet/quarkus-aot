package fr.spacefox.perftests.quarkus.core.service976;

import fr.spacefox.perftests.quarkus.core.port.data.Entity976DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service976.model.Model976;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service976 {

    private final Entity976DatasourcePort datasource;

    public Service976(Entity976DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model976 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
