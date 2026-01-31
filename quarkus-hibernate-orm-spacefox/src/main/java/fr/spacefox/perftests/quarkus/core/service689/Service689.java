package fr.spacefox.perftests.quarkus.core.service689;

import fr.spacefox.perftests.quarkus.core.port.data.Entity689DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service689.model.Model689;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service689 {

    private final Entity689DatasourcePort datasource;

    public Service689(Entity689DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model689 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
