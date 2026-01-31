package fr.spacefox.perftests.quarkus.core.service500;

import fr.spacefox.perftests.quarkus.core.port.data.Entity500DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service500.model.Model500;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service500 {

    private final Entity500DatasourcePort datasource;

    public Service500(Entity500DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model500 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
