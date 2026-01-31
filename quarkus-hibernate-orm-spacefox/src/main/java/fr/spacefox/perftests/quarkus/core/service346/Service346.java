package fr.spacefox.perftests.quarkus.core.service346;

import fr.spacefox.perftests.quarkus.core.port.data.Entity346DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service346.model.Model346;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service346 {

    private final Entity346DatasourcePort datasource;

    public Service346(Entity346DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model346 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
