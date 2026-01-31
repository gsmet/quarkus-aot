package fr.spacefox.perftests.quarkus.core.service929;

import fr.spacefox.perftests.quarkus.core.port.data.Entity929DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service929.model.Model929;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service929 {

    private final Entity929DatasourcePort datasource;

    public Service929(Entity929DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model929 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
