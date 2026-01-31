package fr.spacefox.perftests.quarkus.core.service507;

import fr.spacefox.perftests.quarkus.core.port.data.Entity507DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service507.model.Model507;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service507 {

    private final Entity507DatasourcePort datasource;

    public Service507(Entity507DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model507 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
