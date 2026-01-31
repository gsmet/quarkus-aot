package fr.spacefox.perftests.quarkus.core.service869;

import fr.spacefox.perftests.quarkus.core.port.data.Entity869DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service869.model.Model869;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service869 {

    private final Entity869DatasourcePort datasource;

    public Service869(Entity869DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model869 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
