package fr.spacefox.perftests.quarkus.core.service550;

import fr.spacefox.perftests.quarkus.core.port.data.Entity550DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service550.model.Model550;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service550 {

    private final Entity550DatasourcePort datasource;

    public Service550(Entity550DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model550 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
