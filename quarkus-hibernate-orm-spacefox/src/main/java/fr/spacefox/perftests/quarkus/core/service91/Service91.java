package fr.spacefox.perftests.quarkus.core.service91;

import fr.spacefox.perftests.quarkus.core.port.data.Entity91DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service91.model.Model91;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service91 {

    private final Entity91DatasourcePort datasource;

    public Service91(Entity91DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model91 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
