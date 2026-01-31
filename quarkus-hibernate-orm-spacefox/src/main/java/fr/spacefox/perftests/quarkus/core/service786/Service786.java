package fr.spacefox.perftests.quarkus.core.service786;

import fr.spacefox.perftests.quarkus.core.port.data.Entity786DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service786.model.Model786;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service786 {

    private final Entity786DatasourcePort datasource;

    public Service786(Entity786DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model786 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
