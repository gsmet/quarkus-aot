package fr.spacefox.perftests.quarkus.core.service214;

import fr.spacefox.perftests.quarkus.core.port.data.Entity214DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service214.model.Model214;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service214 {

    private final Entity214DatasourcePort datasource;

    public Service214(Entity214DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model214 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
