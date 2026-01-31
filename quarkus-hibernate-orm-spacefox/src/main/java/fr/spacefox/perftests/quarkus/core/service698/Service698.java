package fr.spacefox.perftests.quarkus.core.service698;

import fr.spacefox.perftests.quarkus.core.port.data.Entity698DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service698.model.Model698;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service698 {

    private final Entity698DatasourcePort datasource;

    public Service698(Entity698DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model698 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
