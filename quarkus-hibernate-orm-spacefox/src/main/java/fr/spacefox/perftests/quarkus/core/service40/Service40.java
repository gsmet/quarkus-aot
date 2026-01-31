package fr.spacefox.perftests.quarkus.core.service40;

import fr.spacefox.perftests.quarkus.core.port.data.Entity40DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service40.model.Model40;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service40 {

    private final Entity40DatasourcePort datasource;

    public Service40(Entity40DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model40 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
