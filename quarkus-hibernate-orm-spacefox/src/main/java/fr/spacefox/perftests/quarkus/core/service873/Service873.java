package fr.spacefox.perftests.quarkus.core.service873;

import fr.spacefox.perftests.quarkus.core.port.data.Entity873DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service873.model.Model873;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service873 {

    private final Entity873DatasourcePort datasource;

    public Service873(Entity873DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model873 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
