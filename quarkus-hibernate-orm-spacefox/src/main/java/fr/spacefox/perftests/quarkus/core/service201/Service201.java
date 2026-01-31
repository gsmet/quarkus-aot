package fr.spacefox.perftests.quarkus.core.service201;

import fr.spacefox.perftests.quarkus.core.port.data.Entity201DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service201.model.Model201;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service201 {

    private final Entity201DatasourcePort datasource;

    public Service201(Entity201DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model201 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
