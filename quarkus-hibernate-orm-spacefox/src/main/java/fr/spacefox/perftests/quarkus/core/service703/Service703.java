package fr.spacefox.perftests.quarkus.core.service703;

import fr.spacefox.perftests.quarkus.core.port.data.Entity703DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service703.model.Model703;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service703 {

    private final Entity703DatasourcePort datasource;

    public Service703(Entity703DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model703 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
