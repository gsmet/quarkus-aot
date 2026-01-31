package fr.spacefox.perftests.quarkus.core.service26;

import fr.spacefox.perftests.quarkus.core.port.data.Entity26DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service26.model.Model26;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service26 {

    private final Entity26DatasourcePort datasource;

    public Service26(Entity26DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model26 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
