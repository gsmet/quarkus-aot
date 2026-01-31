package fr.spacefox.perftests.quarkus.core.service655;

import fr.spacefox.perftests.quarkus.core.port.data.Entity655DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service655.model.Model655;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service655 {

    private final Entity655DatasourcePort datasource;

    public Service655(Entity655DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model655 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
