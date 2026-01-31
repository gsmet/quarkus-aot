package fr.spacefox.perftests.quarkus.core.service138;

import fr.spacefox.perftests.quarkus.core.port.data.Entity138DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service138.model.Model138;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service138 {

    private final Entity138DatasourcePort datasource;

    public Service138(Entity138DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model138 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
