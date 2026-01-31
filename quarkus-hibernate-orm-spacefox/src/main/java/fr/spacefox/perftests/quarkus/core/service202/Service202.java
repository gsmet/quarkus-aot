package fr.spacefox.perftests.quarkus.core.service202;

import fr.spacefox.perftests.quarkus.core.port.data.Entity202DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service202.model.Model202;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service202 {

    private final Entity202DatasourcePort datasource;

    public Service202(Entity202DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model202 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
